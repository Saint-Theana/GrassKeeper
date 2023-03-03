package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerConfirmMatchReq {
    @Tag(tag=12) public Integer matchType = null;
    @Tag(tag=10) public Boolean isAgreed = null;
}
