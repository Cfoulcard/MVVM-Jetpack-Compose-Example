package com.example.mvvm_example.domain.util

/**
 * References the StarNetworkEntity and Stars Model Package
 */
interface EntityMapper <Entity, DomainModel> {

    // Inputs the entity to output domain
    fun mapFromEntity(entity: Entity): DomainModel

    // Inputs domain to output entity
    fun mapToEntity(domainModel: DomainModel): Entity

}