package com.example.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.hibernate.annotations.NaturalId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Tag")
@Table(name = "tag")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","posts"})
public class Tag implements Serializable {
	
	private static final long serialVersionUID = -1769132302079304237L;

	@Id
    @GeneratedValue
    private Long id;
 
    @NaturalId
    private String name;
 
    @OneToMany(
        mappedBy = "tag",
        cascade = CascadeType.ALL,
        orphanRemoval = true,fetch =FetchType.LAZY
    )
    private List<PostTag> posts = new ArrayList<>();
 
    public Tag(String name) {
        this.name = name;
    }
}
