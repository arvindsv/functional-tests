/*************************GO-LICENSE-START*********************************
 * Copyright 2015 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.twist.driver.sahi.browsersettings.win32;


public class ChromeWinSettings extends WinXBrowserSettings{

	public ChromeWinSettings() {
		super("Chrome", "--proxy-server=localhost:9999 --disable-popup-blocking", "chrome.exe");
	}

	public String getDefaultBrowserPath() {
		String quotedUserHome = System.getProperty("user.home");
		return quotedUserHome + "\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe";
	}

}
