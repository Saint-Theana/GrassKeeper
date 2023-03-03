package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class SeaLampFlyLampReq {
    @Tag(tag=9) public Integer itemId = null;
    @Tag(tag=10,isSigned=true) public Integer param = null;
    @Tag(tag=7) public Vector pos = null;
    @Tag(tag=5) public Integer itemNum = null;
}
