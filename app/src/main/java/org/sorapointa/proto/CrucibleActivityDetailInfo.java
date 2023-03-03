package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrucibleBattleUidInfo.*;
import org.sorapointa.proto.CrucibleBattleUidInfo;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class CrucibleActivityDetailInfo {
    @Tag(tag=5) public Integer costTime = null;
    @Tag(tag=12) public Integer battleWorldLevel = null;
    @Tag(tag=3) public List<CrucibleBattleUidInfo> uidInfoList = new ArrayList<>();
    @Tag(tag=9) public Vector pos = null;
}
