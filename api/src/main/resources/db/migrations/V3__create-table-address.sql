CREATE TABLE address (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    VARCHAR(100) NOT NULL,
    uf VARCHAR(100) NOT NULL,
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);