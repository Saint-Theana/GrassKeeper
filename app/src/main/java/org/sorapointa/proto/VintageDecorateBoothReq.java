package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomGadgetTreeInfo.*;
import org.sorapointa.proto.CustomGadgetTreeInfo;

public class VintageDecorateBoothReq {
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=11) public CustomGadgetTreeInfo combinationInfo = null;
}
