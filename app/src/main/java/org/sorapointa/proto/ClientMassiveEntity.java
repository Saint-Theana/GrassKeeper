package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MassiveBoxInfo.*;
import org.sorapointa.proto.MassiveBoxInfo;
import org.sorapointa.proto.MassiveGrassInfo.*;
import org.sorapointa.proto.MassiveGrassInfo;
import org.sorapointa.proto.MassiveWaterInfo.*;
import org.sorapointa.proto.MassiveWaterInfo;

public class ClientMassiveEntity {
    @Tag(tag=1) public Integer entityType = null;
    @Tag(tag=2) public Integer configId = null;
    @Tag(tag=3,isSigned=true) public Long objId = null;
    @Tag(tag=4) public MassiveWaterInfo waterInfo = null;
    @Tag(tag=5) public MassiveGrassInfo grassInfo = null;
    @Tag(tag=6) public MassiveBoxInfo boxInfo = null;
}
