package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerCompoundMaterialReq {
    @Tag(tag=11) public Integer count = null;
    @Tag(tag=3) public Integer compoundId = null;
}
