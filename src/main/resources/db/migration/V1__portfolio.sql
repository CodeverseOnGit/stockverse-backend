CREATE TABLE portfolio (
    id BIGSERIAL PRIMARY KEY,
    user_uuid UUID NOT NULL,
    balance_tokens NUMERIC(20,4) NOT NULL DEFAULT 100000.00,
    updated_at TIMESTAMPTZ DEFAULT NOW()
);
