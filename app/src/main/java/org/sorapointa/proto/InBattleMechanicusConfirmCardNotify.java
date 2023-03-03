package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusConfirmCardNotify {
    @Tag(tag=11) public Integer playIndex = null;
    @Tag(tag=13) public Integer cardId = null;
    @Tag(tag=10) public Integer groupId = null;
    @Tag(tag=2) public Integer playerUid = null;
}
