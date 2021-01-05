package com.example.demo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;


//-------------お問合せフォームの作成---------------

@Getter
@Setter
public class Form implements Serializable{
	@NotBlank(message="選択してね")
    private String category;

    @NotBlank(message="何か入力してね")
    @Length(max=1000)
    private String content;

    public Map<String, String> getCategoryList() {
    Map<String, String> categoryMap = new LinkedHashMap<String, String>();
        categoryMap.put("1", "カテゴリー１");
        categoryMap.put("2", "カテゴリー２");
        categoryMap.put("3", "カテゴリー３");
        return categoryMap;
    }
}
