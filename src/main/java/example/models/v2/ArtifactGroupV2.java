/*
 * Copyright 2019, Yahoo Inc.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */

package example.models.v2;

import com.yahoo.elide.annotation.Include;
import com.yahoo.elide.graphql.subscriptions.annotations.Subscription;
import com.yahoo.elide.graphql.subscriptions.annotations.SubscriptionField;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Include(name = "groups", description = "Artifact group.", friendlyName = "Group")
@Entity
@Subscription
@Data
@Table(name = "artifactgroup")
public class ArtifactGroupV2 {
    @Id
    private String name = "";

    @SubscriptionField
    @Column(name = "commonName")
    private String title = "";
}
