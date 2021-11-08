package com.sts.ImageGallery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.ImageGallery.Model.ImageGallery;

 

@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long> {

}
