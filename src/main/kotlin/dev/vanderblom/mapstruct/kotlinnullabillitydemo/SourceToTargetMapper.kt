package dev.vanderblom.mapstruct.kotlinnullabillitydemo

import org.mapstruct.Mapper

data class Source(val id: Long, val name: String?)
data class Target(val id: Long, val name: String)

@Mapper
interface SourceToTargetMapper {
  fun map(source: Source): Target
}
