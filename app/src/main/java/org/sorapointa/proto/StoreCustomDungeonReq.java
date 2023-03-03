package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StoreCustomDungeonReq {
    @Tag(tag=9) public Boolean isCancelStore = null;
    @Tag(tag=11) public Long dungeonGuid = null;
}
