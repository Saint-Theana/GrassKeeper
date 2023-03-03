package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtCreateGadgetNotify {
    @Tag(tag=8) public Boolean isAsyncLoad = null;
    @Tag(tag=5) public Integer campType = null;
    @Tag(tag=10) public Boolean sightGroupWithOwner = null;
    @Tag(tag=889) public List<Integer> targetEntityIdList = new ArrayList<>();
    @Tag(tag=12) public Integer forwardType = null;
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=3) public Integer targetEntityId = null;
    @Tag(tag=15) public Integer campId = null;
    @Tag(tag=6) public Long guid = null;
    @Tag(tag=13) public Vector initEulerAngles = null;
    @Tag(tag=11) public Integer targetLockPointIndex = null;
    @Tag(tag=1920) public List<Integer> targetLockPointIndexList = new ArrayList<>();
    @Tag(tag=4) public Vector initPos = null;
    @Tag(tag=9) public Integer ownerEntityId = null;
    @Tag(tag=7) public Integer roomId = null;
    @Tag(tag=25) public Boolean isPeerIdFromPlayer = null;
    @Tag(tag=1) public Integer propOwnerEntityId = null;
    @Tag(tag=379) public Boolean isTrueLifeTimeByOwner = null;
    @Tag(tag=14) public Integer configId = null;
}
