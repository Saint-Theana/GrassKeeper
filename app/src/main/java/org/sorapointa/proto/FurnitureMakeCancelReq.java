package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FurnitureMakeCancelReq {
    @Tag(tag=4) public Integer index = null;
    @Tag(tag=15) public Integer makeId = null;
}
