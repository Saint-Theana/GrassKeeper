package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PingReq {
    @Tag(tag=12) public Integer clientTime = null;
    @Tag(tag=14,isFloat=true) public Float ueTime = null;
    @Tag(tag=6,isFloat=true) public Double totalTickTime = null;
    @Tag(tag=10) public byte[] scData = null;
    @Tag(tag=3) public Integer seq = null;
}
