package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientLogBodyPing {
    @Tag(tag=1) public String xg = null;
    @Tag(tag=2) public Integer signalLevel = null;
    @Tag(tag=3) public Integer ping = null;
    @Tag(tag=4) public String servertype = null;
    @Tag(tag=5) public String serverip = null;
    @Tag(tag=6) public String serverport = null;
    @Tag(tag=7) public Integer pcount = null;
    @Tag(tag=8) public Integer plost = null;
    @Tag(tag=9) public String dns = null;
}
