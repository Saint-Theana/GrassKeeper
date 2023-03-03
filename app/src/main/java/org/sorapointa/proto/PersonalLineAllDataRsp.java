package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LockedPersonallineData.*;
import org.sorapointa.proto.LockedPersonallineData;

public class PersonalLineAllDataRsp {
    @Tag(tag=5) public Integer curFinishedDailyTaskCount = null;
    @Tag(tag=13) public List<Integer> canBeUnlockedPersonalLineList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public List<Integer> ongoingPersonalLineList = new ArrayList<>();
    @Tag(tag=11) public Integer legendaryKeyCount = null;
    @Tag(tag=10) public List<LockedPersonallineData> lockedPersonalLineList = new ArrayList<>();
}
