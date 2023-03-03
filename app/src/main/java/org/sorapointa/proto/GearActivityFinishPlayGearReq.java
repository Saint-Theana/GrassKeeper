package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GearColumnInfo.*;
import org.sorapointa.proto.GearColumnInfo;

public class GearActivityFinishPlayGearReq {
    @Tag(tag=4) public Boolean isSuccess = null;
    @Tag(tag=12) public Boolean useClue = null;
    @Tag(tag=9) public List<GearColumnInfo> gearColumnInfoList = new ArrayList<>();
    @Tag(tag=5) public Integer levelId = null;
}
