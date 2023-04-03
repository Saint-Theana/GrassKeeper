package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.HomeFurnitureData.*;
import org.sorapointa.proto.HomeFurnitureData;
import org.sorapointa.proto.HomeBlockArrangementInfo.*;
import org.sorapointa.proto.HomeBlockArrangementInfo;

public class HomeSceneArrangementInfo {
    @Tag(tag=15) public Vector djinnPos = null;
    @Tag(tag=1) public Integer sceneId = null;
    @Tag(tag=5) public Boolean isSetBornPos = null;
    @Tag(tag=10) public Vector bornPos = null;
    @Tag(tag=9) public Integer comfortValue = null;
    @Tag(tag=11) public List<HomeFurnitureData> stairList = new ArrayList<>();
    @Tag(tag=6) public HomeFurnitureData mainHouse = null;
    @Tag(tag=8) public Vector bornRot = null;
    @Tag(tag=4) public Integer tmpVersion = null;
    @Tag(tag=7) public List<HomeFurnitureData> doorList = new ArrayList<>();
    @Tag(tag=3) public List<HomeBlockArrangementInfo> blockArrangementInfoList = new ArrayList<>();
    @Tag(tag=12) public Integer bgmId = null;
}
