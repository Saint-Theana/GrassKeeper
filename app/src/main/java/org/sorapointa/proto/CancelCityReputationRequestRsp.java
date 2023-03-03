package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CancelCityReputationRequestRsp {
    @Tag(tag=3) public Integer cityId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer requestId = null;
}
