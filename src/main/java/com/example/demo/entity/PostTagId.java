package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostTagId implements Serializable {

	private static final long serialVersionUID = 3778212667185051981L;

	@Column(name = "post_id")
    private Long postId;
 
    @Column(name = "tag_id")
    private Long tagId;
    
}
