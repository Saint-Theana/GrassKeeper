package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeHelpData.*;
import org.sorapointa.proto.FurnitureMakeHelpData;

public class FurnitureMakeHelpRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<FurnitureMakeHelpData> helpDataList = new ArrayList<>();
}
