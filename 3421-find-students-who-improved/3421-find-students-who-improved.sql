# Write your MySQL query statement below
WITH first AS (
    SELECT
        *,
        ROW_NUMBER() OVER (
            PARTITION BY student_id, subject
            ORDER BY exam_date ASC
        ) AS first
    FROM Scores
),
last AS (
    SELECT
        *,
        ROW_NUMBER() OVER (
            PARTITION BY student_id, subject
            ORDER BY exam_date DESC
        ) AS last
    FROM Scores
)

SELECT f.student_id, f.subject, f.score AS first_score, l.score AS latest_score FROM first f JOIN last l ON
f.student_id = l.student_id AND f.subject = l.subject
WHERE
    f.score < l.score
    AND f.exam_date < l.exam_date
    AND f.first = 1
    AND l.last = 1;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna