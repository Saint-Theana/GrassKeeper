package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGGameBusinessType.*;
import org.sorapointa.proto.GCGGameBusinessType;
import org.sorapointa.proto.GCGPlayerBriefData.*;
import org.sorapointa.proto.GCGPlayerBriefData;

public class GCGGameBriefData {
    @Tag(tag=14) public Integer gameId = null;
    @Tag(tag=9) public Integer gameUid = null;
    @Tag(tag=13) public Integer businessType = null;
    @Tag(tag=5) public Integer verifyCode = null;
    @Tag(tag=12) public List<GCGPlayerBriefData> playerBriefList = new ArrayList<>();
}
