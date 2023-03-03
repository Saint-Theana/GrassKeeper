package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BargainSnapshot.*;
import org.sorapointa.proto.BargainSnapshot;

public class GetAllActivatedBargainDataRsp {
    @Tag(tag=5) public List<BargainSnapshot> snapshotList = new ArrayList<>();
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
