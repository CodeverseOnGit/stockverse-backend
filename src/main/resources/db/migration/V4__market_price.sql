CREATE TABLE market_price (
    ticker VARCHAR(32) PRIMARY KEY,
    last_price NUMERIC(20,8),
    updated_at TIMESTAMPTZ
);
