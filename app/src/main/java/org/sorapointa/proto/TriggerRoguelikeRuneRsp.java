package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TriggerRoguelikeRuneRsp {
    @Tag(tag=4) public Integer availableCount = null;
    @Tag(tag=14) public Integer runeId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
