package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AcceptCityReputationRequestRsp {
    @Tag(tag=5) public Integer requestId = null;
    @Tag(tag=13) public Integer cityId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
