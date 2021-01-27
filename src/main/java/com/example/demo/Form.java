package com.example.demo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;


//-------------お問合せフォームの作成---------------

//@Getter
//@Setter
public class Form implements Serializable{
	@NotBlank(message="選択してください")
    private String category;

    @NotBlank(message="入力されていません")
    @Length(max=1000)
    private String content;

    public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Map<String, String> getCategoryList() {
    Map<String, String> categoryMap = new LinkedHashMap<String, String>();
        categoryMap.put("1", "質問");
        categoryMap.put("2", "間違った内容");
        categoryMap.put("3", "その他");
        return categoryMap;
    }
}
