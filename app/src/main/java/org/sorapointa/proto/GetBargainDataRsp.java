package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BargainSnapshot.*;
import org.sorapointa.proto.BargainSnapshot;

public class GetBargainDataRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer bargainId = null;
    @Tag(tag=13) public BargainSnapshot snapshot = null;
}
