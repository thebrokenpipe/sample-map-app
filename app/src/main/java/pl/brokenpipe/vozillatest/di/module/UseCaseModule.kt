package pl.brokenpipe.vozillatest.di.module

import dagger.Module
import dagger.Provides
import io.swagger.client.model.MapSearchResponse
import pl.brokenpipe.vozillatest.arch.Repository
import pl.brokenpipe.vozillatest.arch.UseCase
import pl.brokenpipe.vozillatest.interactor.*
import pl.brokenpipe.vozillatest.interactor.model.*
import pl.brokenpipe.vozillatest.repository.map.specification.MapSpecification
import pl.brokenpipe.vozillatest.repository.map.specification.VehicleSpecification
import javax.inject.Singleton

/**
 * Created by gwierzchanowski on 21.02.2018.
 */
@Module
class UseCaseModule {

    @Provides
    @Singleton
    fun provideGetClusterTypesUseCase(): UseCase<@JvmWildcard Unit, @JvmWildcard List<ClusterType>> {
        return GetClusterTypes()
    }

    @Provides
    @Singleton
    fun provideGetMapObjectsUseCase(): UseCase<@JvmWildcard List<String>, @JvmWildcard Map<ClusterType, List<MapObject>>> {
        return GetMapObjects()
    }

    @Provides
    @Singleton
    fun provideGetParkingsUseCase(cache: HashMap<String, ParkingModel>): UseCase<@JvmWildcard String, @JvmWildcard List<ParkingModel>> {
        return GetParkings(cache)
    }

    @Provides
    @Singleton
    fun provideGetPoisUseCase(cache: HashMap<String, PoiModel>): UseCase<@JvmWildcard String, @JvmWildcard List<PoiModel>> {
        return GetPois(cache)
    }

    @Provides
    @Singleton
    fun provideGetVehicleUseCase(cache: HashMap<String, VehicleModel>): UseCase<@JvmWildcard String, @JvmWildcard List<VehicleModel>> {
        return GetVehicles(cache)
    }

    @Provides
    @Singleton
    fun provideGetChargersUseCase(cache: HashMap<String, ChargerModel>): UseCase<@JvmWildcard String, @JvmWildcard List<ChargerModel>> {
        return GetChargers(cache)
    }

    @Provides
    @Singleton
    fun provideGetZonesUseCase(cache: HashMap<String, ZoneModel>): UseCase<@JvmWildcard String, @JvmWildcard List<ZoneModel>> {
        return GetZones(cache)
    }

    @Provides
    @Singleton
    fun provideRefreshMapObjectsUseCase(
            mapObjectsRepository: Repository<MapSearchResponse, MapSpecification>,
            vehicleCache: HashMap<String, VehicleModel>,
            parkingCache: HashMap<String, ParkingModel>,
            chargerCache: HashMap<String, ChargerModel>,
            poiCache: HashMap<String, PoiModel>,
            zoneCache: HashMap<String, ZoneModel>
    ): UseCase<@JvmWildcard MapObjectsFilter, @JvmWildcard Unit> {
        return RefreshMapObjects(mapObjectsRepository, vehicleCache, parkingCache,
                chargerCache, poiCache, zoneCache)
    }
}