CREATE TABLE transaction (
    id BIGSERIAL PRIMARY KEY,
    portfolio_id BIGINT NOT NULL REFERENCES portfolio(id) ON DELETE CASCADE,
    ticker VARCHAR(32) NOT NULL,
    side VARCHAR(8) NOT NULL,  -- BUY / SELL
    quantity NUMERIC(20,8) NOT NULL,
    price NUMERIC(20,8) NOT NULL,
    executed_at TIMESTAMPTZ DEFAULT NOW()
);
