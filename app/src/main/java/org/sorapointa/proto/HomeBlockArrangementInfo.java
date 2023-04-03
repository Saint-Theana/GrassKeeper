package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeFurnitureSuiteData.*;
import org.sorapointa.proto.HomeFurnitureSuiteData;
import org.sorapointa.proto.HomeBlockFieldData.*;
import org.sorapointa.proto.HomeBlockFieldData;
import org.sorapointa.proto.WeekendDjinnInfo.*;
import org.sorapointa.proto.WeekendDjinnInfo;
import org.sorapointa.proto.HomeFurnitureData.*;
import org.sorapointa.proto.HomeFurnitureData;
import org.sorapointa.proto.HomeBlockDotPattern.*;
import org.sorapointa.proto.HomeBlockDotPattern;
import org.sorapointa.proto.HomeFurnitureGroupData.*;
import org.sorapointa.proto.HomeFurnitureGroupData;
import org.sorapointa.proto.HomeNpcData.*;
import org.sorapointa.proto.HomeNpcData;
import org.sorapointa.proto.HomeFurnitureCustomSuiteData.*;
import org.sorapointa.proto.HomeFurnitureCustomSuiteData;
import org.sorapointa.proto.HomeAnimalData.*;
import org.sorapointa.proto.HomeAnimalData;

public class HomeBlockArrangementInfo {
    @Tag(tag=12) public List<HomeFurnitureSuiteData> furnitureSuiteList = new ArrayList<>();
    @Tag(tag=13) public List<HomeBlockFieldData> fieldList = new ArrayList<>();
    @Tag(tag=8) public List<WeekendDjinnInfo> weekendDjinnInfoList = new ArrayList<>();
    @Tag(tag=6) public List<HomeFurnitureData> persistentFurnitureList = new ArrayList<>();
    @Tag(tag=7) public List<HomeBlockDotPattern> dotPatternList = new ArrayList<>();
    @Tag(tag=9) public Integer comfortValue = null;
    @Tag(tag=3) public List<HomeFurnitureGroupData> furnitureGroupList = new ArrayList<>();
    @Tag(tag=15) public List<HomeFurnitureData> deployFurniureList = new ArrayList<>();
    @Tag(tag=5) public List<HomeNpcData> deployNpcList = new ArrayList<>();
    @Tag(tag=4) public List<HomeFurnitureCustomSuiteData> furnitureCustomSuiteList = new ArrayList<>();
    @Tag(tag=1) public Boolean isUnlocked = null;
    @Tag(tag=2) public Integer blockId = null;
    @Tag(tag=14) public List<HomeAnimalData> deployAnimalList = new ArrayList<>();
}
