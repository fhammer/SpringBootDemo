package com.play.boot.rest;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.play.boot.entity.Book;

/**
 * 这里主要是记录配置文件的使用方式
 * @author fuzh2
 *
 */
@RestController
@RequestMapping("/books")
public class BookResource {

	@Value("${book.bookname}")
	private String bookname;
	@Value("${book.price}")
	private int price;

	@Resource
	Book book;

	@RequestMapping(value = "/bookinfo")
	public String miya() {
		return bookname + ":" + price;
	}

	@RequestMapping(value = "/book")
	public String bookBean() {
		return book.getBookname() + ":" + book.getPrice() + " r= " + book.getRandom();
	}

}
