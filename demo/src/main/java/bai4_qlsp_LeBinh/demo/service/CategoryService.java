package bai4_qlsp_LeBinh.demo.service;

import org.springframework.stereotype.Service;

import bai4_qlsp_LeBinh.demo.model.Category;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    private List<Category> listCategory = new ArrayList<>();

    public CategoryService() {
        // Khởi tạo một số dữ liệu mẫu giống như trong bài học
        listCategory.add(new Category(1, "Công nghệ"));
        listCategory.add(new Category(2, "Kinh tế"));
        listCategory.add(new Category(3, "Kỹ năng sống"));
    }

    public List<Category> getAll() {
        return listCategory;
    }

    public Category get(int id) {
        return listCategory.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}