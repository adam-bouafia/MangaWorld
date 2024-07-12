package it.univaq.sose.mangastoreaccountservice.repository.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import it.univaq.sose.mangastorecommons.util.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * Represents an OAuth client in the system.
 * This class is used to store information about OAuth clients, such as client ID, client secret, grant types, authorities, scope, and resource IDs.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oauth_client_details")
@Builder
public class OAuthClient extends DateAudit {

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "CLIENT_ID", updatable = false, nullable = false)
  private String client_id;

  @Column(name = "CLIENT_SECRET", updatable = false, nullable = false)
  private String client_secret;
  private String authorized_grant_types;
  private String authorities;
  private String scope;
  private String resource_ids;

}
