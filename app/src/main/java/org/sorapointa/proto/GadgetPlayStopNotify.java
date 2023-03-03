package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GadgetPlayUidInfo.*;
import org.sorapointa.proto.GadgetPlayUidInfo;

public class GadgetPlayStopNotify {
    @Tag(tag=14) public Boolean isWin = null;
    @Tag(tag=7) public Integer entityId = null;
    @Tag(tag=4) public Integer playType = null;
    @Tag(tag=8) public List<GadgetPlayUidInfo> uidInfoList = new ArrayList<>();
    @Tag(tag=5) public Integer score = null;
    @Tag(tag=6) public Integer costTime = null;
}
