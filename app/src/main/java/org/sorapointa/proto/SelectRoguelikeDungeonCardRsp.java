package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectRoguelikeDungeonCardRsp {
    @Tag(tag=9) public Integer cardId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
