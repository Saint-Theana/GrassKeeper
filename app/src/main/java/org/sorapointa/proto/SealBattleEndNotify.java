package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SealBattleEndNotify {
    @Tag(tag=4) public Boolean isWin = null;
    @Tag(tag=15) public Integer sealEntityId = null;
}
