package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerCompoundMaterialBoostReq {
    @Tag(tag=8) public Boolean isBoostAll = null;
    @Tag(tag=14) public Integer targetCompoundGroupId = null;
    @Tag(tag=9) public Integer consumeMaterialId = null;
    @Tag(tag=1) public Integer consumeMaterialCount = null;
}
