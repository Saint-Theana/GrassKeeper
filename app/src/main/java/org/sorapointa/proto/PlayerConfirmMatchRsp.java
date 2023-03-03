package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerConfirmMatchRsp {
    @Tag(tag=9) public Integer matchType = null;
    @Tag(tag=4) public Integer matchId = null;
    @Tag(tag=11) public Boolean isAgreed = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
