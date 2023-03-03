package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BuildingInfo {
    @Tag(tag=1) public Integer buildingId = null;
    @Tag(tag=2) public Integer pointConfigId = null;
    @Tag(tag=3) public Integer cost = null;
    @Tag(tag=5) public Integer refund = null;
    @Tag(tag=6) public Integer ownerUid = null;
    @Tag(tag=7) public Integer currentNum = null;
    @Tag(tag=8) public Integer maxNum = null;
}
