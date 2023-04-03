package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WaterInfo.*;
import org.sorapointa.proto.WaterInfo;
import org.sorapointa.proto.GrassInfo.*;
import org.sorapointa.proto.GrassInfo;
import org.sorapointa.proto.BoxInfo.*;
import org.sorapointa.proto.BoxInfo;

public class ClientMassiveEntity {
    @Tag(tag=1) public Integer entityType = null;
    @Tag(tag=2) public Integer configId = null;
    @Tag(tag=3,isSigned=true) public Long objId = null;
    @Tag(tag=4) public WaterInfo waterInfo = null;
    @Tag(tag=5) public GrassInfo grassInfo = null;
    @Tag(tag=6) public BoxInfo boxInfo = null;
}
