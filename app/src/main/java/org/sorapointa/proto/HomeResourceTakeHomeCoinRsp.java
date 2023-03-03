package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeResource.*;
import org.sorapointa.proto.HomeResource;

public class HomeResourceTakeHomeCoinRsp {
    @Tag(tag=7) public HomeResource homeCoin = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
