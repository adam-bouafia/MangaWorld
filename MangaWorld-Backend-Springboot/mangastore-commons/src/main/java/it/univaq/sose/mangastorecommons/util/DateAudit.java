package it.univaq.sose.mangastorecommons.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
    value = {"created_at", "updated_at"},
    allowGetters = true
)
@Getter
@Setter
public abstract class DateAudit implements Serializable {

  @CreatedDate
  @Column(name = "CREATED_AT")
  private Instant createdAt;

  /**
   * Represents a date audit for tracking the last modified date of an entity.
   * The last modified date is stored in the "UPDATED_AT" column of the database table.
   */
  @LastModifiedDate
  @Column(name = "UPDATED_AT")
  private Instant updatedAt;

}
