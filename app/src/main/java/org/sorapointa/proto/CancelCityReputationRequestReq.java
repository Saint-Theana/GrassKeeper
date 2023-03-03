package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CancelCityReputationRequestReq {
    @Tag(tag=10) public Integer requestId = null;
    @Tag(tag=6) public Integer cityId = null;
}
