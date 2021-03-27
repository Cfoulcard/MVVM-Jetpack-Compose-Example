package com.example.mvvm_example.model

import com.example.mvvm_example.domain.util.EntityMapper

class StarNetworkMapper : EntityMapper<StarNetworkEntity, Stars> {

    override fun mapFromEntity(entity: StarNetworkEntity): Stars {
        return Stars(
            title = entity.title,
            description = entity.description
        )
    }

    override fun mapToEntity(domainModel: Stars): StarNetworkEntity {
        return StarNetworkEntity(
            title = domainModel.title,
            description = domainModel.description
        )
    }

    fun fromEntityList(initial: List<StarNetworkEntity>): List<Stars> {
        return initial.map { mapFromEntity(it) }
    }

    fun toEntityList(initial: List<Stars>): List<StarNetworkEntity> {
        return initial.map { mapToEntity(it) }
    }
}