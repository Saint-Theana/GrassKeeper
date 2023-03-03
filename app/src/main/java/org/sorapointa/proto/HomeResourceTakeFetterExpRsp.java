package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeResource.*;
import org.sorapointa.proto.HomeResource;

public class HomeResourceTakeFetterExpRsp {
    @Tag(tag=4) public HomeResource fetterExp = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
