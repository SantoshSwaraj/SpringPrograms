package co.santosh.dao;

import java.util.List;

import co.santosh.entity.Stock;

public interface StockDAO {
	public void batchInsert(List<Stock> stocks);
}
